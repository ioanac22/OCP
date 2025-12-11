import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class Challenge2_StringArraysTest {

    private Challenge2_StringArrays challenge;

    @BeforeEach
    void setUp() {
        challenge = new Challenge2_StringArrays();
    }

    @Test
    @DisplayName("Test 1.1: Basic array with different lengths - return reversed")
    void testFindLongestStringBasic() {
        String[] words = {"cat", "elephant", "dog", "butterfly"};
        assertEquals("ylfrettub", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.2: Multiple strings with same max length - return first reversed")
    void testFindLongestStringMultipleSameLength() {
        String[] words = {"apple", "mango", "peach"};
        assertEquals("elppa", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.3: Progressive lengths - return reversed")
    void testFindLongestStringProgressive() {
        String[] words = {"a", "ab", "abc", "ab"};
        assertEquals("cba", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.4: Empty array")
    void testFindLongestStringEmpty() {
        String[] words = {};
        assertEquals("", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.5: Single string - return reversed")
    void testFindLongestStringSingle() {
        String[] words = {"hello"};
        assertEquals("olleh", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.6: All same length - return first reversed")
    void testFindLongestStringAllSame() {
        String[] words = {"cat", "dog", "bat", "rat"};
        assertEquals("tac", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.7: Very long string - return reversed")
    void testFindLongestStringVeryLong() {
        String[] words = {"short", "verylongstringhere", "mid"};
        assertEquals("erehgnirtsgnolyrev", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.8: Empty strings in array")
    void testFindLongestStringWithEmpty() {
        String[] words = {"", "hello", "", "world"};
        assertEquals("olleh", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.9: All empty strings")
    void testFindLongestStringAllEmpty() {
        String[] words = {"", "", ""};
        assertEquals("", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.10: Longest at different positions - always reversed")
    void testFindLongestStringAtDifferentPositions() {
        // Longest at start
        String[] words1 = {"elephant", "cat", "dog"};
        assertEquals("tnahpele", challenge.findLongestString(words1));
        
        // Longest at end
        String[] words2 = {"cat", "dog", "elephant"};
        assertEquals("tnahpele", challenge.findLongestString(words2));
        
        // Longest in middle
        String[] words3 = {"cat", "elephant", "dog"};
        assertEquals("tnahpele", challenge.findLongestString(words3));
    }

    @Test
    @DisplayName("Test 1.11: Palindrome string")
    void testFindLongestStringPalindrome() {
        String[] words = {"cat", "radar", "dog"};
        assertEquals("radar", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.12: Single character")
    void testFindLongestStringSingleChar() {
        String[] words = {"a", "b", "c"};
        assertEquals("a", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.13: Verify reversal with known string")
    void testFindLongestStringVerifyReversal() {
        String[] words = {"test", "programming"};
        String result = challenge.findLongestString(words);
        assertEquals("gnimmargorp", result);
        assertEquals(11, result.length());
    }

    @Test
    @DisplayName("Test 1.14: Two character string")
    void testFindLongestStringTwoChars() {
        String[] words = {"ab", "a"};
        assertEquals("ba", challenge.findLongestString(words));
    }

    @Test
    @DisplayName("Test 1.15: Numbers in string - reversed correctly")
    void testFindLongestStringWithNumbers() {
        String[] words = {"abc123", "test"};
        assertEquals("321cba", challenge.findLongestString(words));
    }

}
