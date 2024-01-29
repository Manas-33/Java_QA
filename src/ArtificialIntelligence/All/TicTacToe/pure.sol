
pragma solidity ^0.8.0;

contract ViewAndPureExample {
    uint public stateVariable = 10;

    // View function: Reads from the state but does not modify it
    function getState() public view returns (uint) {
        return stateVariable;
    }

    // View function calling another view function
    function doubleState() public view returns (uint) {
        return getState() * 2;
    }

    // Pure function: Performs computations without reading or modifying the state
    function addNumbers(uint a, uint b) public pure returns (uint) {
        return a + b;
    }

    // Pure function calling another pure function
    function multiplyNumbers(uint a, uint b) public pure returns (uint) {
        return multiply(a, b);
    }

    // Internal pure function
    function multiply(uint a, uint b) internal pure returns (uint) {
        return a * b;
    }
}
