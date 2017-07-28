
Test example for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Develop

```bash
npm i -g shadow-cljs
```

With hot code swapping support:

```bash
shadow-cljs watch app
# another tty
node target/test.js
```

### Steps

* add `shadow-cljs.edn` to config compilation
* compile ClojureScript
* run `node target/test.js` to start app and watch testing

Some guides on tests: https://nakkaya.com/2009/11/18/unit-testing-in-clojure/

### License

MIT
