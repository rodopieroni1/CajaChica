package Controller;

import Config.Conexion;
import com.sun.faces.action.RequestMapping;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();

    @RequestMapping("index")
    public ModelAndView Listar() {
        String sql = "select * from caja";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.setViewName("index");
        mav.addObject("lista", datos);

        return mav;
    }

}
