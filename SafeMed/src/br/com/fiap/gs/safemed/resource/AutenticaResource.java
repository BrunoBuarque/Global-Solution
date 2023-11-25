package br.com.fiap.gs.safemed.resource;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Autentica;
import br.com.fiap.bo.AutenticaBO;

        @Path("/Autentica")
	    public class AutenticaResource {
		
		private AutenticaBO AutenticaBO = new AutenticaBO();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Autentica> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Autentica>) AutenticaBO.selecionarBO();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response inserirRs (Autentica acs, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			AutenticaBO.inserirBO(acs);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path((acs.getlogin()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{login_Autentica}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response alterarRs (Autentica acs, @PathParam("login_Autentica") int id_Medicamento) throws SQLException, ClassNotFoundException {
			AutenticaBO.alterarBO(acs);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{login_Autentica}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deletarRs (@PathParam("login_Autentica") String login_Autentica) throws ClassNotFoundException, SQLException {
			AutenticaBO.deletarBO(login_Autentica);
			return Response.ok().build();
		}

}
