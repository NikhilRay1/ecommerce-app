//package Ecommerce.App.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        SecurityScheme bearerScheme = new SecurityScheme()
//                .type(SecurityScheme.Type.HTTP)
//                .scheme("bearer")
//                .bearerFormat("JWT")
//                .description("JWT Bearer Token");
//
//        SecurityRequirement bearerRequirement = new SecurityRequirement()
//                .addList("Bearer Authentication");
//
//        return new OpenAPI()
//                .info(new Info()
//                        .title("Spring Boot eCommerce API")
//                        .version("1.0")
//                        .description("This is a Spring Boot Project for eCommerce")
//                        .license(new License().name("Our License Link").url("http://embarkx.com"))
//                        .contact(new Contact()
//                                .name("Faisal Memon")
//                                .email("faisal@embarkx.com")
//                                .url("https://github.com/EmbarkxOfficial")))
//                .externalDocs(new ExternalDocumentation()
//                        .description("Project Documentation")
//                        .url("http://embarkx.com"))
//                .components(new Components()
//                        .addSecuritySchemes("Bearer Authentication", bearerScheme))
//                .addSecurityItem(bearerRequirement);
//    }
//}
