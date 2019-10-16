
Script testing example for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

> Find more in docs https://shadow-cljs.github.io/docs/UsersGuide.html#_testing .

> Find out more about testing https://nakkaya.com/2009/11/18/unit-testing-in-clojure/ .

### Develop

It's suggested to install shadow-cljs inside project(`node_modules/`):

```bash
yarn # or npm
```

Run tests:

```bash
yarn shadow-cljs compile app &&
node target/test.js
```

Or start shadow-cljs in watch mode:

```bash
yarn shadow-cljs watch app

# then...
# node target/test.js
```

### Steps

* add `shadow-cljs.edn` to config compilation
* compile ClojureScript
* run `node target/test.js` to start app(or watch testing)

### License

MIT
