public class ApiController {
    @getMapping("/")
    public String Welcome(){
        return "Welcome String Boot!";
    }

}
