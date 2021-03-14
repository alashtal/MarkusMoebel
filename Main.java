class Main {
  /**
     * Main to read the string and print out the value
     * @param args
     */
    public static void main(String[] args) {
	System.out.print("Please enter a name: ");
	WordsCalculator classObject = new WordsCalculator();
        String name = classObject.readName();

        System.out.println(classObject.calculator(name));

    }
}
