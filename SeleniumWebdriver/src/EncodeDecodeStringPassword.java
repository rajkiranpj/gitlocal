import org.apache.commons.codec.binary.Base64;

public class EncodeDecodeStringPassword {

	public static void main(String[] args) {
		String str="admin123";
		byte [] encodedstring =Base64.encodeBase64(str.getBytes());
		System.out.println("Encoded String :"+ new String(encodedstring));
		
		byte []decodedstring =Base64.decodeBase64(encodedstring);
		System.out.println("Decoded String :"+new String(decodedstring)); 

	}

}
