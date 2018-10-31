package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void singleCheckBox(){
        String outputMassage=new CheckBoxPage(driver).singleCheckBox();
        Assertions.assertThat(outputMassage).isEqualTo("Success - Check box is checked");

    }
}
