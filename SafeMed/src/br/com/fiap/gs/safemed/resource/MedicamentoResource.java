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

import br.com.fiap.beans.Medicamento;
import br.com.fiap.bo.MedicamentoBO;

        @Path("/Medicamento")
	    public class MedicamentoResource {
		
		private MedicamentoBO MedicamentoBO = new MedicamentoBO();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Medicamento> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Medicamento>) MedicamentoBO.selecionarBO();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response inserirRs (Medicamento acs, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			MedicamentoBO.inserirBO(acs);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path(Integer.toString(acs.getId()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{id_Medicamento}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response alterarRs (Medicamento acs, @PathParam("id_Medicamento") int id_Medicamento) throws SQLException, ClassNotFoundException {
			MedicamentoBO.alterarBO(acs);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{id_Medicamento}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deletarRs (@PathParam("id_Medicamento") int id_Medicamento) throws ClassNotFoundException, SQLException {
			MedicamentoBO.deletarBO(id_Medicamento);
			return Response.ok().build();
		}

}

