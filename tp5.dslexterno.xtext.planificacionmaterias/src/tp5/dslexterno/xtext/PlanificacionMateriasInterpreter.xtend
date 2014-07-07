package tp5.dslexterno.xtext

import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import tp5.dslexterno.xtext.planificacionMaterias.Model

class PlanificacionMateriasInterpreter {

	def static void main(String[] args) {
		if (args.isEmpty) {
			throw new RuntimeException("Debe invocar este interprete con la ruta completa a un archivo .pmdsl como argumento")
		}
		val fileName = args.get(0)
		val model = parsear(fileName)
		new PlanificacionMateriasInterpreter().interpret(model)
	}
	
	def static parsear(String fileName) {
		val injector = new PlanificacionMateriasStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(XtextResourceSet)
		val resource = resourceSet.createResource(URI.createURI(fileName))
		resource.load(#{})
		return resource.contents.get(0) as Model
	}
	        
	def interpret(Model model) {
	      // ACA VA EL CODIGO DEL INTERPRETE
	}
}