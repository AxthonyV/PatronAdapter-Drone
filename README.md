# Practica 004 - Patron Adapter: Drone

Implementacion del patron de diseno Adapter para adaptar un Drone como Pato.

## Clases

- **Pato** - Interfaz objetivo
- **Drone** - Interfaz del adaptado
- **SuperDrone** - Implementacion concreta del Drone
- **AdaptadorDrone** - Adaptador que convierte Drone en Pato
- **DroneAdaptadorDemo** - Clase de prueba

## Output

<img width="365" height="193" alt="image" src="https://github.com/user-attachments/assets/739ecec0-c329-4c95-a7e2-3bdfa606beb9" />

El programa demuestra el patron Adapter: AdaptadorDrone envuelve
un SuperDrone y lo hace compatible con la interfaz Pato, traduciendo cuaquear() a beep() y volar() a despegar()+girarRotor(), 
permitiendo usar un Drone donde se espera un Pato sin modificar ninguna clase existente
