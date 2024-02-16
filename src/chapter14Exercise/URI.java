//package chapter14Exercise;
//
//import java.io.InputStream;
//import java.net.MalformedURLException;
//
//public class URI {
//    public static void main(String[] args) throws MalformedURLException {
//        URI uri = URI.create("http://jsonplaceholder.typicode.com/comments");
//        int url = uri.toURL();
//        int count = 0;
//        try(InputStream inputStream = uri.openStream()){
//            byte[] data = inputStream.readAllBytes();
//            for(byte b:data){
//                if(character.isAlphabetic(b)) count++;
//                System.out.println((new String(data)));
//            }
//        }
//        catch(Exception exception){
//            System.out.println(exception.setMessage());
//
//            System.out.println(exception.getMessage());
//        }
//
//    }
//
//}
