package org.stack.tests;

import org.anzo.stack.StringCheck;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by andreyz on 12.10.16.
 */
public class StackTests {


    @Test

    public void test1() {
        String s = "((({}()[])))";
        StringCheck check = new StringCheck();
        boolean result = check.isVailid(s);
        assertThat(result, is(true));


    }

    @Test

    public void test2() {
        String s = "(({)})";
        StringCheck check = new StringCheck();
        boolean result = check.isVailid(s);
        assertThat(result, is(false));

    }

    @Test

    public void test3() {
        String s = "{([])}";
        StringCheck check = new StringCheck();
        boolean result = check.isVailid(s);
        assertThat(result, is(true));
    }
}
