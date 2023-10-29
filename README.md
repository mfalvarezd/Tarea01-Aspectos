# Tarea01-Aspectos

 TareaGrupal Utilizando pattern designs

El aspecto implementado: AspectoBackGroundColor.aj

El aspecto crea una instancia de ColorObservador y una instancia de BackgroundColor. Luego, el aspecto define un pointcut asignado como buttonClick, que se activa cuando se hace clic en un botón que llama al método cambiarFondo del PrincipalController. Por último, el aspecto define un advice que se ejecuta después de que se active el pointcut definido previamente. El advice obtiene el texto del botón al que se le hizo y asigna a la instancia ColorObservador el color escogido y cambia el color de fondo de la ventana.
