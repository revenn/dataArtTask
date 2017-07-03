import dataart.StringPermutationService;
import dataart.StringPermutationServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class StringPermutationServiceTest {

    private String base = "test_string";

    private StringPermutationService service = new StringPermutationServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void testFailedOnNull() {
        service.checkForPermutation(base, null);
    }

    @Test
    public void testDifferentLength() {
        boolean isPermutation = service.checkForPermutation(base, "test_string_test");
        Assert.assertFalse(isPermutation);
    }

    @Test
    public void testEqualStrings() {
        boolean isPermutation = service.checkForPermutation(base, new String(base.toCharArray()));
        Assert.assertTrue(isPermutation);
    }

    @Test
    public void testPermutedString() {
        boolean isPermutation = service.checkForPermutation(base, "ginrts_test");
        Assert.assertTrue(isPermutation);
    }

    @Test
    public void testSameLengthsButNotPermutedString() {
        boolean isPermutation = service.checkForPermutation(base, "stribg_test");
        Assert.assertFalse(isPermutation);
    }

}