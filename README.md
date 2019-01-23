# Novilie

## Reglas Generales

- Solo los lideres pueden hacer push a sus respectivos branches.
- Solo Tania puede hacer push a el branch `master`.
- Los branches bases son `backend`, `frontend`, `master`.
- En el branch `backend` se editara nada mas el paquete de backend.
- En el branch `frontend` se editara nada mas el paquete de frontend.
- En el branch `master` se encontraran ambos paquetes `backend` y `frontend`, ya listos para produccion, es decir, ya revisados por sus respectivos lideres.
- Cada quien solo puede hacer push sobre su propio branch.
- Si quieres trabajar sobre el branch de otra persona o un branch base (`backend` y `frontend`), no podras hacer push directamente, deberas hacer un PR(pull request) y el mismo debera ser aprobado.
- En los branch base solo Tania, y sus respectivos lideres podran aprobar cambios(PR).
- Los Lideres no pueden hacer push a el branch `master`, solo Tania puede, cada lider debe hacer un PR para que Tania incluya en el branch `master`.
### NOTA: Porfavor que los commits sean explicativos, para facilitar que cambio se hizo


# Comandos Importantes de GIT para la colaboracion en equipo por branches
- `git merge <branch>` Este comando unira el branch en el que estas con el branch especificado, es decir, si estas en `backend` este comando `git merge query-get` pondra todos los commits de `query-get` en el branch `backend` uniendolos.

- `git checkout -b <nombre_del_nuevo_branch>` Este comando es el que mas utilizaras pues en la reglas se establece que en cada cambio que hagas sobre el branch que estes debes hacer un fork(crear un nuevo branch) y al finalizar el cambio hacer PR para que luego este cambio sea mergeado a el branch base. Un branch base es aquel sobre el cual hiciste el fork, es decir, si estas en `backend` y haces `git checkout -b query-get` el nodo base de el branch `query-get` sera `backend`. 

- `git rebase <branch>` Una vez hayas creado tu branch con el comando anterior, usa rebase cada vez que se actualice tu branch base, es decir, si se actualiza el branch `backend` y estas trabajando sobre el mismo debes hacer `git rebase backend`, si surge algun `conflicto` arreglalo.

- `git push origin <branch>` Siendo `origin` el alias de el repositorio remoto de GitHub, este comando pusheara tus commits a el repositorio `origin` en el `<branch>` especificado, siendo `<branch>` el nombre del branch en el que trabajaste.

- `git pull origin <branch>` Lo mismo de arriba solo que este no hace push si no que hace pull, es decir, si estas en `backend` el comando `git pull origin backend` traera todos los cambios desde el repositiorio remoto `origin`.

- `git checkout <branch>` Para cambiar de branch usas este comando. Por ejemplo, estando en `master` `git checkout backend` te llevara hacia el branch `backend`.

- `git add <archivo>` Este comando añadira el `<archivo>` al commit que se realizara, es decir, `git add hola.java` añadira el archivo `hola.java` a tu commit. NOTA: si usas `git commit add .` se añadiran todos aquellos archivos que estan pendientes por añadir.

- `git commit -m '<mensaje>' ` Este comando hara commit de lo archivos añadidos anteriormente con un `'<mensaje>'`, siendo `<mensaje>` lo que quieras. Ejemplo, habiendo hecho `git add hola.java` si hago `git commit -m "Añadiendo el modulo hola.java"` se creara un commit que reflejara ese cambio.

- `git status` te permite que archivos estan en tu carpeta, pero no estan siendo localizados por git, es decir, no se encuentran dentro del repositorio.  