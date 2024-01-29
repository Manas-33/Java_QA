package ComputerNetworks.Assignment1;

import java.util.HashSet;
import java.util.Set;

class WaterJugProblem {

    static class State {
        int jug1;
        int jug2;

        State(int jug1, int jug2) {
            this.jug1 = jug1;
            this.jug2 = jug2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return jug1 == state.jug1 && jug2 == state.jug2;
        }

        @Override
        public int hashCode() {
            return 31 * jug1 + jug2;
        }
    }

    public static void main(String[] args) {
        int capacityJug1 = 4;
        int capacityJug2 = 3;
        int targetAmount = 2;

        Set<State> visitedStates = new HashSet<>();
        dfs(new State(0, 0), capacityJug1, capacityJug2, targetAmount, visitedStates);
    }

    static void dfs(State currentState, int capacityJug1, int capacityJug2, int target, Set<State> visitedStates) {
        if (currentState.jug1 == target || currentState.jug2 == target) {
            System.out.println("Solution found:");
            printSolution(currentState);
            return;
        }

        visitedStates.add(currentState);

        // Fill jug 1
        if (currentState.jug1 < capacityJug1) {
            State nextState = new State(capacityJug1, currentState.jug2);
            if (!visitedStates.contains(nextState)) {
                dfs(nextState, capacityJug1, capacityJug2, target, visitedStates);
            }
        }

        // Fill jug 2
        if (currentState.jug2 < capacityJug2) {
            State nextState = new State(currentState.jug1, capacityJug2);
            if (!visitedStates.contains(nextState)) {
                dfs(nextState, capacityJug1, capacityJug2, target, visitedStates);
            }
        }

        // Pour from jug 1 to jug 2
        int pourAmount = Math.min(currentState.jug1, capacityJug2 - currentState.jug2);
        if (pourAmount > 0) {
            State nextState = new State(currentState.jug1 - pourAmount, currentState.jug2 + pourAmount);
            if (!visitedStates.contains(nextState)) {
                dfs(nextState, capacityJug1, capacityJug2, target, visitedStates);
            }
        }

        // Pour from jug 2 to jug 1
        pourAmount = Math.min(currentState.jug2, capacityJug1 - currentState.jug1);
        if (pourAmount > 0) {
            State nextState = new State(currentState.jug1 + pourAmount, currentState.jug2 - pourAmount);
            if (!visitedStates.contains(nextState)) {
                dfs(nextState, capacityJug1, capacityJug2, target, visitedStates);
            }
        }

        visitedStates.remove(currentState);  // Backtrack
    }

    static void printSolution(State state) {
        System.out.println("Jug 1: " + state.jug1 + ", Jug 2: " + state.jug2);
    }
}