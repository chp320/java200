package org.list.ex179;

import java.io.*;

/** 데이터 주고받기 (DataOutputStream)
 *  - 주제: 데이터를 주고받는 방법을 알아본다.
 *  - writeXXX 메서드와 readXXX 메서드 사용
 */

public class WritingDatas {
    /**
     * writingData
     * @param fname - 파일명
     * @param append - 기존 파일에 대해 내용 추가나 삭제를 결정
     * @throws IOException - 파일 관련된 처리는 무조건 등록 필요
     */
    public void writingData(String fname, boolean append) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(new File(fname), append);
            dos = new DataOutputStream(fos);
            dos.writeBoolean(append);
            dos.writeByte(123);
            dos.writeChar(75);
            dos.writeDouble(34.56);
            dos.writeFloat(345.23f);
            dos.writeInt(123);
            dos.writeLong(345L);
            dos.writeUTF("홍길동");        // DataOutputStream 은 '바이트 스트림' 이므로 ASCII 이외의 문자는 보장불가하여 writeUTF 메서드 사용
            dos.flush();        // dos.close() 동일
        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다.");
        }
    }

    /**
     * readingData
     * @param fname - 파일명
     * @throws IOException - 파일 관련된 처리는 무조건 등록 필요
     */
    public void readingData(String fname) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(new File(fname));
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("append 가능? : " + dis.readBoolean());
            System.out.println("read byte : " + dis.readByte());
            System.out.println("read char : " + dis.readChar());
            System.out.println("read double : " + dis.readDouble());
            System.out.println("read float : " + dis.readFloat());
            System.out.println("read int : " + dis.readInt());
            System.out.println("read long : " + dis.readLong());
            System.out.println("read utf : " + dis.readUTF());
            dis.close();        // dis.flush() 동일
        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다.");
        }
    }
}
