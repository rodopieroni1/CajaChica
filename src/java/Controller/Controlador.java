/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entidad.Caja;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;

    @RequestMapping("index")
    public ModelAndView Listar() {
        String sql = "select * from caja join chofer";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("index");
        return mav;
        
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        mav.addObject(new Caja());
        mav.setViewName("agregar");
        return mav;
    }

    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Caja c) {
        String sql = "insert into caja(Descripcion, Fecha, CodOperario, NumCaja, Reposicion, Saldo, TotEgres)values(?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, c.getDescripcion(), c.getFecha(), c.getCodOperario(), c.getNumCaja(), c.getReposicion(), c.getSaldo(), c.getTotEgres());
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value ="editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id= Integer.parseInt(request.getParameter("id"));
        String sql="SELECT * FROM caja WHERE idCaja="+id;
        datos= this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("editar");
    return mav;
    }
    
    @RequestMapping(value ="editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Caja c){
        String sql="update caja set Descripcion=?, Fecha=?, CodOperario=?, NumCaja=?, Reposicion=?, Saldo=?, TotEgres=? where idCaja="+id;
        this.jdbcTemplate.update(sql, c.getDescripcion(), c.getFecha(), c.getCodOperario(), c.getNumCaja(), c.getReposicion(), c.getSaldo(), c.getTotEgres());
        return new ModelAndView("redirect:/index.htm");
    }
    

}
