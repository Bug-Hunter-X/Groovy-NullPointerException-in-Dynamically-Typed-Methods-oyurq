# Groovy NullPointerException Example

This repository demonstrates a common but subtle issue in Groovy:  NullPointerExceptions that can occur even when you've added null checks. This happens because Groovy's dynamic typing doesn't always throw an exception immediately when you encounter null; the error may surface later in the code when you try to access properties or methods of that null value.

The `bug.groovy` file contains a simple example showcasing this.  The `bugSolution.groovy` file shows how to mitigate the issue using more robust null handling. 

## How to reproduce

1. Clone the repository.
2. Run `groovy bug.groovy`  Observe that the NullPointerException is thrown on the second test even though there is a null check. 
3. Run `groovy bugSolution.groovy` to see how the issue is resolved.

## Solution
The solution involves using Groovy's safe navigation operator (`?.`) and elvis operator (`?:`) to handle potential null values gracefully. The safe navigation operator prevents a NullPointerException when accessing properties or methods on potentially null objects, and the Elvis operator provides a default value if the left side is null. 