package ArtificialIntelligence.All.monkeybanana;

import java.util.*;

public class monkeybananaBFS {
    private static class State {
        int monkeyPosition;
        int boxPosition;
        boolean hasBanana;

        public State(int monkeyPosition, int boxPosition, boolean hasBanana) {
            this.monkeyPosition = monkeyPosition;
            this.boxPosition = boxPosition;
            this.hasBanana = hasBanana;
        }

        @Override
        public int hashCode() {
            return Objects.hash(monkeyPosition, boxPosition, hasBanana);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            State state = (State) obj;
            return monkeyPosition == state.monkeyPosition &&
                    boxPosition == state.boxPosition &&
                    hasBanana == state.hasBanana;
        }
    }

    public static void main(String[] args) {
        int monkeyInitialPos = 0;
        int boxInitialPos = 1;
        boolean bananaInitialState = false;

        List<State> path = solveMonkeyBanana(monkeyInitialPos, boxInitialPos, bananaInitialState);

        if (path.isEmpty()) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Solution found:");
            for (State state : path) {
                System.out.println(state.monkeyPosition + " " + state.boxPosition + " " + state.hasBanana);
            }
        }
    }

    private static List<State> solveMonkeyBanana(int monkeyInitialPos, int boxInitialPos, boolean bananaInitialState) {
        Queue<State> queue = new LinkedList<>();
        Set<State> visited = new HashSet<>();
        Map<State, State> parent = new HashMap<>();

        State initialState = new State(monkeyInitialPos, boxInitialPos, bananaInitialState);
        queue.add(initialState);
        visited.add(initialState);

        while (!queue.isEmpty()) {
            State currentState = queue.poll();

            if (currentState.hasBanana) {
                // Reconstruct the path
                List<State> path = new ArrayList<>();
                while (currentState != null) {
                    path.add(currentState);
                    currentState = parent.get(currentState);
                }
                Collections.reverse(path);
                return path;
            }

            // Generate next possible states
            List<State> nextStates = generateNextStates(currentState);
            for (State nextState : nextStates) {
                if (!visited.contains(nextState)) {
                    queue.add(nextState);
                    visited.add(nextState);
                    parent.put(nextState, currentState);
                }
            }
        }

        return Collections.emptyList(); // No solution found
    }

    private static List<State> generateNextStates(State currentState) {
        List<State> nextStates = new ArrayList<>();

        // Monkey moves
        int[] monkeyMoves = {-1, 1};
        for (int move : monkeyMoves) {
            int newMonkeyPos = currentState.monkeyPosition + move;
            if (newMonkeyPos >= 0 && newMonkeyPos <= 2) {
                nextStates.add(new State(newMonkeyPos, currentState.boxPosition, currentState.hasBanana));
            }
        }

        // Box moves
        int[] boxMoves = {-1, 1};
        for (int move : boxMoves) {
            int newBoxPos = currentState.boxPosition + move;
            if (newBoxPos >= 0 && newBoxPos <= 2) {
                nextStates.add(new State(currentState.monkeyPosition, newBoxPos, currentState.hasBanana));
            }
        }

        // Monkey and Box move together
        int newMonkeyPos = currentState.monkeyPosition + 1;
        int newBoxPos = currentState.boxPosition;
        if (newMonkeyPos <= 2) {
            nextStates.add(new State(newMonkeyPos, newBoxPos, currentState.hasBanana));
        }

        return nextStates;
    }
}