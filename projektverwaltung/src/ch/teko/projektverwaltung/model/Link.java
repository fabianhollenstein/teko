/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.servlet.http.Part;

/**
 * @author Fabian
 *
 */
@Entity
public class Link implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9140305296972477712L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

//	@Lob
//	private byte[] file;
//	public byte[] getFile() {
//		return file;
//	}
//
//	public void setFile(byte[] file) {
//		this.file = file;
//	}

	
//	private Part part;
	private String link;
	private URL url;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

//	public Part getPart() {
//		return part;
//	}
//	
//	public void setPart(Part part) {
//		this.part = part;
//		InputStream input = null;
//		try {
//			input = part.getInputStream();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		ByteArrayOutputStream output = new ByteArrayOutputStream();
//		byte[] buffer = new byte[1024];
//		try {
//			for (int length = 0; (length = input.read(buffer)) > 0;) output.write(buffer, 0, length);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		this.file = output.toByteArray();
//	}

//	public Part getFile() {
//		return file;
//	}
//
//	public void setFile(Part file) throws IOException {
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		InputStream inputStream = file.getInputStream(); 
//		
//		int next = inputStream.read();
//		while (next > -1) {
//		    out.write(next);
//		    next = inputStream.read();
//		}
//	
//	fileAsByteArray = out.toByteArray();
//		this.file = file;
//	}
	
}
