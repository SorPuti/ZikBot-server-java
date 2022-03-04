package br.com.githu.zik.client.load.extension;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Loader {

	public abstract void onRead();
	
	
	 public static byte[] toBytes(Object obj) {
	      ByteArrayOutputStream boas = new ByteArrayOutputStream();
	      try (ObjectOutputStream ois = new ObjectOutputStream(boas)) {
	          ois.writeObject(obj);
	          return boas.toByteArray();
	      } catch (IOException ioe) {
	          ioe.printStackTrace();
	      }
	      throw new RuntimeException();
	  }

	  public static Object toObject(byte[] bytes) {
	      InputStream is = new ByteArrayInputStream(bytes);
	      try (ObjectInputStream ois = new ObjectInputStream(is)) {
	          return ois.readObject();
	      } catch (IOException | ClassNotFoundException ioe) {
	          ioe.printStackTrace();
	      }
	      throw new RuntimeException();
	  }
}
