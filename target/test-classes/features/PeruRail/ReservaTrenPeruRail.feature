@ReservaDePasajes
Feature: Reserva de pasajes de tren en Peru Rail

  @ReservaCusco1

  Scenario Outline: Primera reserva en Cusco (Puno > Cusco)
    Given Que Alonso inicializa la pagina de Peru Rail
    When Selecciona los datos de rutas y servicios de tren
      | TipoCamino     | Destino     | Ruta     | Tren     | PasajerosMenores     | PasajerosMayores     | FechaIda     | FechaRetorno     |
      | "<TipoCamino>" | "<Destino>" | "<Ruta>" | "<Tren>" | "<PasajerosMenores>" | "<PasajerosMayores>" | "<FechaIda>" | "<FechaRetorno>" |
    And Busca la disponibilidad del tren
    And Selecciono el tipo de cabina: "<TipoCabina>" y CantidadCabinas: "<CantidadCabinas>"
    And Seleccionar continuar
    And Ingresar datos de primer pasajero: "<Nombres>" "<Apellidos>" "<FechaNacimiento>" "<Nacionalidad>" "<TipoDocumento>" "<NumeroDocumento>" "<Sexo>" "<Telefono>" "<Correo>" "<ConfirmacionCorreo>"
    And Continuo al pago de pasajes
    Then Verifico datos origen en carrito resumen: "Belmond Andean Explorer" "Miercoles 20 Abril 2022" "1 ADULTO" "USD 2,415.00"

    Examples:
      | TipoCamino | Destino | Ruta         | Tren                             | PasajerosMenores | PasajerosMayores | FechaIda | FechaRetorno | TipoCabina   | CantidadCabinas | Nombres        | Apellidos     | FechaNacimiento | Nacionalidad | TipoDocumento          | NumeroDocumento | Sexo      | Telefono  | Correo                   | ConfirmacionCorreo       |
      | Ida        | Cusco   | Puno > Cusco | Andean Explorer, A Belmond Train | 0                | 1                | 20       | 20           | SUITE CABINS | 1               | Eduardo Alonso | Navarro Alban | 18-Ener-1993    | Perú         | Documento de Identidad | 70347931        | Masculino | 974964108 | edualonso_11@hotmail.com | edualonso_11@hotmail.com |


  @ReservaCusco2

  Scenario Outline: Segunda reserva en Cusco (Machu Picchu > Cusco)
    Given Que Alonso inicializa la pagina de Peru Rail
    When Selecciona los datos de rutas y servicios de tren
      | TipoCamino     | Destino     | Ruta     | Tren     | PasajerosMenores     | PasajerosMayores     | FechaIda     | FechaRetorno     |
      | "<TipoCamino>" | "<Destino>" | "<Ruta>" | "<Tren>" | "<PasajerosMenores>" | "<PasajerosMayores>" | "<FechaIda>" | "<FechaRetorno>" |
    And Busca la disponibilidad del tren
    And Selecciono el tipo de tren de ida: "<TrenIda>" y tren de regreso "<TrenRegreso>"
    And Seleccionar continuar verde
    And Ingresar datos de primer pasajero dos: "<Nombres>" "<Apellidos>" "<FechaNacimiento>" "<Nacionalidad>" "<TipoDocumento>" "<NumeroDocumento>" "<Sexo>" "<Telefono>" "<Correo>" "<ConfirmacionCorreo>"
    And Continuo a enviar pago de pasajes
    Then Verifico datos origen ida en carrito resumen: "Expedition 34" "Miercoles 20 Abril 2022" "1 Adulto(s):" "USD 146.00"

    Examples:
      | TipoCamino   | Destino | Ruta                 | Tren | PasajerosMenores | PasajerosMayores | FechaIda | FechaRetorno | TrenIda       | TrenRegreso  | Nombres        | Apellidos     | FechaNacimiento | Nacionalidad | TipoDocumento          | NumeroDocumento | Sexo      | Telefono  | Correo                   | ConfirmacionCorreo       |
      | Ida y Vuelta | Cusco   | Machu Picchu > Cusco | -    | 0                | 1                | 20       | 21           | Expedition 34 | Vistadome 33 | Eduardo Alonso | Navarro Alban | 18-ENERO-1993    | Perú         | Documento de Identidad | 70347931        | Masculino | 974964108 | edualonso_11@hotmail.com | edualonso_11@hotmail.com |




