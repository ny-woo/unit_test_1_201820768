import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    //null을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input(){
        String str = null;
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertThat(numberOfUpperCaseCharactersInString, is(0));

        String str2 = "Hello";
        int numberOfUpperCaseCharactersInString2 = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str2);
        assertThat(numberOfUpperCaseCharactersInString2, is(0));
    }

    //반겂울 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertThat(numberOfUpperCaseCharactersInString, is(0));

        String str2 = "Bye";
        int numberOfUpperCaseCharactersInString2 = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str2);
        assertThat(numberOfUpperCaseCharactersInString2, is(0));
    }

    //대문자들이 포함된 문자열을 전달했을 때 카운팅된 숫자와 맞는지 검증하는 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_ABCDEFGHIJ() {
        String str = "ABCDEFGHIJ";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 10);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString == 9);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(10));
        System.out.println("numberOfUpperCaseCharactersInString :: " + numberOfUpperCaseCharactersInString);

        String str2 = "ZYX";
        int numberOfUpperCaseCharactersInString2 = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str2);
        assertThat(numberOfUpperCaseCharactersInString2, is(3));
        assertTrue(numberOfUpperCaseCharactersInString2 == 3);
        assertFalse(numberOfUpperCaseCharactersInString2 == 1);
        System.out.println("numberOfUpperCaseCharactersInString2 :: " + numberOfUpperCaseCharactersInString2);
    }

    //대소문자가 섞여 있을 때 정확히 카운팅 되는 지에 대한 테스트 코드 작성
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_6_for_ABCdefGHI(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result == 6);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result == 4);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result, is(6));
        System.out.println("result :: " + result);

        String str2 = "abc";
        int result2 = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str2);
        assertThat(result2, is(0));
        System.out.println("result2 :: " +result2);
    }

    //잘못된 값을 참조했을 때 IndexOutOfBoundsException Exception이 발생하는지 테스트 코드 작성
    @Test
    public void shouldThrowExceptionWhenGetZeroIndex() {
        new ArrayList<Object>().get(0);

        new ArrayList<String>().get(1);
    }

    //해당 메소드가 제한된 시간내에 실행되는지에 대한 테스트 코드 작성 : timeout 사용
    //두번째로 해당 메소드는 테스트 하지 않도록 어노테이션 추가 적용 해봅니다. Ignore
    @Ignore
    @Test
    public void testShouldRunInLimitedTime() throws InterruptedException {
        Thread.sleep(4000);
        Thread.sleep(2000);
        System.out.println("제한된 시간 내에 수행되면 테스트 Passed!");
        //전체 실행시켰을때 이부분은 Ignore때문에 실행안됨
    }
}
