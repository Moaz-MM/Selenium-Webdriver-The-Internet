package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadFilePage;

public class UploadFileTests extends BaseTests {

    @Test
    public void testUploadFile() {
        UploadFilePage uploadFilePage = homePage.clickUploadFile();
        String filePath = "E:\\luka.jpg";
        uploadFilePage.uploadFile(filePath);

        Assert.assertEquals(uploadFilePage.getUploadedFile(), "luka.jpg", "files not matched");
    }
}
