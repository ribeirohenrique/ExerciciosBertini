package br.com.bertini.cadastroendereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CadastroEnderecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroEnderecoApplication.class, args);
	}

}
