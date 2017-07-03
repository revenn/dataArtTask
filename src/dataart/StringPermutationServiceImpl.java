package dataart;

import java.util.Arrays;

public class StringPermutationServiceImpl implements StringPermutationService {

    @Override
    public boolean checkForPermutation(String base, String candidate) {
        if(candidate == null)
            throw new IllegalArgumentException();
        
        if(base.length() != candidate.length())
            return false;
        
        if(base.equals(candidate))
            return true;
        
        char[] a = base.toCharArray();
        char[] b = candidate.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
