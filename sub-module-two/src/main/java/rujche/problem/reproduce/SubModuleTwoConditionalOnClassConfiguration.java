package rujche.problem.reproduce;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("conditional-on-class")
@Configuration
@Import(SubModuleOneConditionalOnClassConfiguration.class)
public class SubModuleTwoConditionalOnClassConfiguration {

}
