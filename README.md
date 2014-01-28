# Site for AGI - RT ⑊ IS

This site is based off of the [StartBootstrap][5] [Modern (Dark) Business][6]
template that was ported to [Hoplon][4].

[![screenshot](https://raw2.github.com/oubiwann/agirtis-site/master/resources/screenshots/main-page-small.jpg)](https://raw2.github.com/oubiwann/agirtis-site/master/resources/screenshots/main-page.jpg)

## Dependencies

- java 1.7+
- [boot][1]
- [leiningen][2]

## Usage

You'll probably want to have two terminals open in your project's
directory.

1. Start the auto-compiler:

    ```bash
    $ make watch
    ```

1. Start the dev server:

    ```bash
    $ make dev
    ```

1. Open [localhost:9999][3] in your browser to view the rendered html.

1. Hack on your ``src/*.cljs.hl`` files!


[1]: https://github.com/tailrecursion/boot
[2]: https://github.com/technomancy/leiningen
[3]: http://localhost:9999/
[4]: http://hoplon.io/
[5]: http://startbootstrap.com/
[6]: https://github.com/oubiwann/hoplon-modern-business
