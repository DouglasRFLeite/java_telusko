<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Oi</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
  </head>
  <body>
    Welcome to Douglas!

    <form action="addAlien" method="post">
      Enter Alien Id: <input type="text" name="id" /><br />
      Enter Alien Name: <input type="text" name="name" /><br />
      <input type="submit" />
    </form>

    <hr />

    <form action="getAlien" method="get">
      Enter Alien Id: <input type="text" name="id" /><br />
      <input type="submit" />
    </form>

    <hr />

    <form action="getAlienByName" method="get">
      Enter Alien Name: <input type="text" name="name" /><br />
      <input type="submit" />
    </form>
  </body>
</html>
