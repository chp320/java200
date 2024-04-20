# 도서 <JAVA 200제> 스터디

## 접근 제한자
- 기본 접근 제한자: 동일 패키지/클래스에서만 접근 가능. public, protected 와 달리 별도 keyword 없이 사용함
- public : import만 하면 모든 곳에서 접근 가능
- private : 동일 패키지 내 클래스 '내부'에서만 접근 가능
- protected : 상속 관계 클래스에서 public 과 같이 사용되며, 상속 관계 아닌 클래스에서 '기본 접근 제한자'와 같이 사용됨

## 자바 문서(javadoc) 생성
- 목적: 패키지(디렉토리) 내 java 파일에 대한 API 문서 생성
```shell
javadoc -use <패키지(디렉토리)경로/*.java>
```

## 자바 압축 파일(jar-자바 아카이브)
- 유형: 실행 파일이 없는 라이브러리 방식(Library), 실행 파일이 있는 어플리케이션 방식(Application)

### jar 라이브러리 방식
1. 자바 소스 파일을 패키지 컴파일 (컴파일 대상 파일이 존재하는 디렉토리로 이동하여 작업)
```shell
javac -d <컴파일 파일 저장 경로> <컴파일 대상 파일>
ex) javac -d ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/code/test1/classes/ *.java
```
2. 자바 압축 파일 생성. 이릁 통해 jar 파일이 생성됨 (작업 대상 파일이 존재하는 디렉토리로 이동하여 작업)
```shell
jar -cvf <jar파일명> -C  <jar 파일 저장 경로> <작업 대상 파일이 존재하는 디렉토리>
ex) jar -cvf test.jar -C ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/code/test1/classes/ .
```

### jar 어플리케이션 방식
1. 자바 소스를 패키지 컴파일 (컴파일 대상 파일이 존재하는 디렉토리(일반적으로 classes)로 이동하여 작업)
```shell
javac -d <컴파일 파일 저장 경로> <컴파일 대상 파일>
```
2. 실행 압축 파일을 만들기 위한 '환경 설정'
- 1번에서 작업한 디렉토리에서 META-INF 디렉토리 생성
- MANIFEST.MF 파일 생성 후 정보 입력 (Main-Class 는 실행 메인 클래스 정보 기재)
```manifest
Manifest-Version: 1.0
Main-Class: org.list.com.jungbo.three.SecretMain
```
3. 자바 압축 파일 생성. 이를 통해 jar 파일이 생성됨 (작업 대상 파일이 존재하는 디렉토리로 이동하여 작업)
- 아래 cvfM 에서 M 은 앞서 작성한 META-INF 를 이용한다는 의미
```shell
jar -cvfM <jar파일명> -C <jar 파일 저장 경로> <작업 대상 파일이 존재하는 디렉토리>
ex) jar -cvfM secrete2.jar -C ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/code/test2/classes/ .
```
4. 메인 클래스를 실행
- 앞서 4번에서 생성한 jar 파일이 위치한 곳에서 java 명령어로 실행
```shell
java -jar ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/code/test2/secrete2/secrete2.jar
```
5. 자바 문서(javadoc) 생성
- 웹 페이지가 생성이 되고, index.html 파일을 실행해서 javadoc 사용
```shell
javadoc -use ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/one/*.java ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/two/*.java ~/IdeaProjects/java200/src/main/java/org/list/com/jungbo/three/*.java
```

<hr>

## javap 이용하기
- 목적: 클래스 내의 모든 메서드를 확인 가능 !!
- 컴파일 된 소스(.class)를 이용하여 디스어셈블(disassemble)하여 자바 소스(.java)로 변경 없이 클래스/메서드/생성자 등 골격 확인 가능
```shell
javap 
$ javap org.list.com.jungbo.two.MyTopSecret
Compiled from "MyTopSecret.java"
public class org.list.com.jungbo.two.MyTopSecret extends org.list.com.jungbo.one.MyMotherSecret {
  java.lang.String myBoyFriend;
  public org.list.com.jungbo.two.MyTopSecret(int, java.lang.String, double, java.lang.String);
  public org.list.com.jungbo.two.MyTopSecret();
  public java.lang.String toString();
}
```
- 만일 다른 위치의 클래스를 확인하고 싶은 경우 경로를 설정(-classpath)하면 됨