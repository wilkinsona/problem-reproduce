package rujche.problem.reproduce;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("all-nested-condition")
@Configuration
@Import(SubModuleOneAllNestedConditionConfiguration.class)
public class SubModuleTwoAllNestedConditionConfiguration {

}
