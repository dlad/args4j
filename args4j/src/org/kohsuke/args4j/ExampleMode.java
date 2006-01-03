package org.kohsuke.args4j;

/**
 * Used with {@link CmdLineParser#printExample(ExampleMode)}.
 *
 * @author Kohsuke Kawaguchi
 */
public enum ExampleMode {
    /**
     * Print all defined options in the example.
     *
     * <p>
     * This would be useful only when you have small number of options.
     */
    ALL() {
        /*package*/ boolean print(Option o) {
            return true;
        }
    },

    /**
     * Print all {@link Option#required() required} option.
     */
    REQUIRED() {
        /*package*/ boolean print(Option o) {
            return o.required();
        }
    };

    /*package*/ abstract boolean print(Option o);
}
