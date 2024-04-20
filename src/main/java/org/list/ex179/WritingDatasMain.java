package org.list.ex179;

import java.io.IOException;

public class WritingDatasMain {

    public static void main(String[] args) {
        WritingDatas wd = new WritingDatas();
        try {
            wd.writingData("writed.txt", false);    // 동일한 이름의 파일이 존재할 경우 "덮어써서" 새로 저장함
            wd.readingData("writed.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
