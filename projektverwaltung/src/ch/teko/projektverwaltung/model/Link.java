/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.file.Files;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;

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

	//private Part file;
	private byte[] fileAsByteArray;
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
