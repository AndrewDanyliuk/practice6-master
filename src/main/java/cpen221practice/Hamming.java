package cpen221practice;

class Hamming {

    private String leftString;
    private String rightString;
    Hamming(String leftStrand, String rightStrand) {

        if(leftStrand.length() == 0)
        {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if(rightStrand.length() == 0)
        {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if(leftStrand.length() != rightStrand.length())
        {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }



        leftString = leftStrand;
        rightString = rightStrand;
    }

    int getHammingDistance() {
        int numberOfMismatches = 0;
        for(int i = 0; i < leftString.length(); ++i)
        {
            if(leftString.charAt(i) != rightString.charAt(i))
            {
                numberOfMismatches++;
            }
        }
        return numberOfMismatches;
    }

}
