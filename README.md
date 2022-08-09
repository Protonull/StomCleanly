# StomCleanly

This is a drag&drop solution to add a `/stop` command to your server should you want one.

## Aliases

- `/exit`
- `/quit`
- `/end`
- `/shutdown`
- `/halt`
- `/terminate`

## Permissions

The command is callable by the Console, but also by any player with the `server.stop` permission. You'll need to manage
how that permission is granted yourself.

## Why?

Bafflingly, it would appear that `/stop` is somewhat controversial in the Minestom community. This micro-extension
exists for anyone like myself who likes the convenience of having a command to safely shutdown the server. Not all
server owners are sysadmins; not all servers are managed by panels; not all servers are static; not all servers are
docker'd or kubernetes'd; not all server owners are comfortable Ctrl+C'ing their servers; not all server owners live in
their terminals; etc... some server owners just want a command, a command they can use in-game, and this is as a
drag&drop solution for that. Enjoy.