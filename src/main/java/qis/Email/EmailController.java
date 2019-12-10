package qis.Email;

import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.http.MediaType;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class EmailController {
	
	private EmailConfig emailConfig;
	
	public EmailController(EmailConfig emailConfig) {
		this.emailConfig = emailConfig;
	}
	
	@PostMapping("/sendMail")
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void sendFeedback(@RequestParam("email") List<String> email, @RequestParam("subject") String subject,
		@RequestParam("body") String body, @RequestParam("file") List<MultipartFile> fileInput) throws MessagingException {
		// Create mail sender
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(this.emailConfig.getHost());
		mailSender.setPort(this.emailConfig.getPort());
		mailSender.setUsername(this.emailConfig.getUsername());
		mailSender.setPassword(this.emailConfig.getPassword());
		
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
		
	    int x;
	    for(x = 0; x < email.size(); x++) {
			 MimeMessage message = mailSender.createMimeMessage(); MimeMessageHelper
			 helper = new MimeMessageHelper(message, true);
			 
			 String toEmail = email.get(x);
			 helper.setFrom("questphil.corpresult@gmail.com"); helper.setTo(toEmail);
			 helper.setSubject(subject); helper.setText(body);
			 
			 int i; for(i = 0; i < fileInput.size(); i++) { String fileName =
			 fileInput.get(i).getOriginalFilename(); helper.addAttachment(fileName,
			 fileInput.get(i)); }
			 
			 mailSender.send(message);
		}
	}

	public EmailConfig getEmailConfig() {
		return emailConfig;
	}

	public void setEmailConfig(EmailConfig emailConfig) {
		this.emailConfig = emailConfig;
	}
}
