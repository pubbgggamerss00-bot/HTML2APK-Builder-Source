package org.gradle.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser.class */
public final class CommandLineParser {
    public final HashMap optionsByString = new HashMap();
    public boolean allowUnknownOptions;
    public static final /* synthetic */ boolean $assertionsDisabled = !CommandLineParser.class.desiredAssertionStatus();
    public static final Pattern OPTION_NAME_PATTERN = Pattern.compile("(\\?|\\p{Alnum}[\\p{Alnum}-_]*)");

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$AfterOptions.class */
    public final class AfterOptions extends ParserState {
        public final ParsedCommandLine commandLine;

        public AfterOptions(ParsedCommandLine parsedCommandLine) {
            super(0);
            this.commandLine = parsedCommandLine;
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final boolean maybeStartOption(String str) {
            return false;
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final OptionParserState onStartOption(String str, String str2) {
            return new UnknownOptionParserState(str, this.commandLine, this);
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final ParserState onNonOption(String str) {
            this.commandLine.extraArguments.add(str);
            return this;
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$BeforeFirstSubCommand.class */
    public final class BeforeFirstSubCommand extends OptionAwareParserState {
        public BeforeFirstSubCommand(ParsedCommandLine parsedCommandLine) {
            super(parsedCommandLine);
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final OptionParserState onStartOption(String str, String str2) {
            OptionString optionString = new OptionString(str, str2);
            CommandLineOption commandLineOption = (CommandLineOption) CommandLineParser.this.optionsByString.get(str2);
            if (commandLineOption != null) {
                return new KnownOptionParserState(optionString, commandLineOption, this.commandLine, this);
            }
            if (CommandLineParser.this.allowUnknownOptions) {
                return new UnknownOptionParserState(str, this.commandLine, this);
            }
            throw new CommandLineArgumentException(String.format("Unknown command-line option '%s'.", optionString));
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$KnownOptionParserState.class */
    public final class KnownOptionParserState extends OptionParserState {
        public final OptionString optionString;
        public final CommandLineOption option;
        public final ParsedCommandLine commandLine;
        public final ParserState state;
        public final ArrayList values;

        public KnownOptionParserState(OptionString optionString, CommandLineOption commandLineOption, ParsedCommandLine parsedCommandLine, ParserState parserState) {
            super(0);
            this.values = new ArrayList();
            this.optionString = optionString;
            this.option = commandLineOption;
            this.commandLine = parsedCommandLine;
            this.state = parserState;
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final ParserState onArgument(String str) {
            if (this.option.argumentType == Void.TYPE) {
                throw new CommandLineArgumentException(String.format("Command-line option '%s' does not take an argument.", this.optionString));
            }
            if (str.length() == 0) {
                throw new CommandLineArgumentException(String.format("An empty argument was provided for command-line option '%s'.", this.optionString));
            }
            this.values.add(str);
            return onComplete();
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final ParserState onStartNextArg() {
            return (this.option.argumentType == Void.TYPE || !this.values.isEmpty()) ? onComplete() : new MissingOptionArgState(this);
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final boolean getHasArgument() {
            return this.option.argumentType != Void.TYPE;
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final ParserState onComplete() {
            if (this.option.argumentType != Void.TYPE && this.values.isEmpty()) {
                Object[] objArr = new Object[2];
                objArr[0] = this.optionString;
                CommandLineOption commandLineOption = this.option;
                StringBuilder sb = new StringBuilder();
                String str = commandLineOption.description;
                if (str != null) {
                    sb.append(str);
                }
                objArr[1] = sb.toString();
                throw new CommandLineArgumentException(String.format("No argument was provided for command-line option '%s' with description: '%s'", objArr));
            }
            ParsedCommandLine parsedCommandLine = this.commandLine;
            String str2 = this.optionString.option;
            CommandLineOption commandLineOption2 = this.option;
            ParsedCommandLineOption parsedCommandLineOption = (ParsedCommandLineOption) Objects.requireNonNull((ParsedCommandLineOption) parsedCommandLine.optionsByString.get(str2));
            parsedCommandLine.presentOptions.addAll(commandLineOption2.options);
            if (parsedCommandLineOption.values.size() + this.values.size() > 1 && this.option.argumentType != List.class) {
                throw new CommandLineArgumentException(String.format("Multiple arguments were provided for command-line option '%s'.", this.optionString));
            }
            Iterator it = this.values.iterator();
            while (it.hasNext()) {
                parsedCommandLineOption.values.add((String) it.next());
            }
            Iterator it2 = this.option.groupWith.iterator();
            while (it2.hasNext()) {
                CommandLineOption commandLineOption3 = (CommandLineOption) it2.next();
                ParsedCommandLine parsedCommandLine2 = this.commandLine;
                parsedCommandLine2.getClass();
                Iterator it3 = commandLineOption3.options.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    if (parsedCommandLine2.presentOptions.remove(str3)) {
                        parsedCommandLine2.removedOptions.add(str3);
                    }
                }
            }
            return this.state;
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$MissingOptionArgState.class */
    public final class MissingOptionArgState extends ParserState {
        public final OptionParserState option;

        public MissingOptionArgState(OptionParserState optionParserState) {
            super(0);
            this.option = optionParserState;
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final boolean maybeStartOption(String str) {
            return str.matches("(?s)-.+");
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final OptionParserState onStartOption(String str, String str2) {
            return this.option.onComplete().onStartOption(str, str2);
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final ParserState onNonOption(String str) {
            return this.option.onArgument(str);
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final void onCommandLineEnd() {
            this.option.onComplete();
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$OptionAwareParserState.class */
    public abstract class OptionAwareParserState extends ParserState {
        public final ParsedCommandLine commandLine;

        public OptionAwareParserState(ParsedCommandLine parsedCommandLine) {
            super(0);
            this.commandLine = parsedCommandLine;
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final boolean maybeStartOption(String str) {
            return str.matches("(?s)-.+");
        }

        @Override // org.gradle.cli.CommandLineParser.ParserState
        public final ParserState onNonOption(String str) {
            this.commandLine.extraArguments.add(str);
            CommandLineParser commandLineParser = CommandLineParser.this;
            Pattern pattern = CommandLineParser.OPTION_NAME_PATTERN;
            commandLineParser.getClass();
            return new AfterOptions(this.commandLine);
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$OptionParserState.class */
    public abstract class OptionParserState {
        public OptionParserState() {
        }

        public /* synthetic */ OptionParserState(int i10) {
            this();
        }

        public abstract ParserState onStartNextArg();

        public abstract ParserState onArgument(String str);

        public abstract boolean getHasArgument();

        public abstract ParserState onComplete();
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$OptionString.class */
    public final class OptionString {
        public final String arg;
        public final String option;

        public OptionString(String str, String str2) {
            this.arg = str;
            this.option = str2;
        }

        public final String toString() {
            return this.arg.startsWith("--") ? "--" + this.option : "-" + this.option;
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$ParserState.class */
    public abstract class ParserState {
        public ParserState() {
        }

        public /* synthetic */ ParserState(int i10) {
            this();
        }

        public abstract boolean maybeStartOption(String str);

        public abstract OptionParserState onStartOption(String str, String str2);

        public abstract ParserState onNonOption(String str);

        public void onCommandLineEnd() {
        }
    }

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/cli/CommandLineParser$UnknownOptionParserState.class */
    public final class UnknownOptionParserState extends OptionParserState {
        public final ParserState state;
        public final String arg;
        public final ParsedCommandLine commandLine;

        public UnknownOptionParserState(String str, ParsedCommandLine parsedCommandLine, ParserState parserState) {
            super(0);
            this.arg = str;
            this.commandLine = parsedCommandLine;
            this.state = parserState;
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final boolean getHasArgument() {
            return true;
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final ParserState onStartNextArg() {
            return onComplete();
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final ParserState onArgument(String str) {
            return onComplete();
        }

        @Override // org.gradle.cli.CommandLineParser.OptionParserState
        public final ParserState onComplete() {
            ParsedCommandLine parsedCommandLine = this.commandLine;
            parsedCommandLine.extraArguments.add(this.arg);
            return this.state;
        }
    }

    public final CommandLineOption option(String... strArr) {
        for (String str : strArr) {
            if (this.optionsByString.containsKey(str)) {
                throw new IllegalArgumentException(String.format("Option '%s' is already defined.", str));
            }
            if (str.startsWith("-")) {
                throw new IllegalArgumentException(String.format("Cannot add option '%s' as an option cannot start with '-'.", str));
            }
            if (!OPTION_NAME_PATTERN.matcher(str).matches()) {
                throw new IllegalArgumentException(String.format("Cannot add option '%s' as an option can only contain alphanumeric characters or '-' or '_'.", str));
            }
        }
        CommandLineOption commandLineOption = new CommandLineOption(Arrays.asList(strArr));
        Iterator it = commandLineOption.options.iterator();
        while (it.hasNext()) {
            this.optionsByString.put((String) it.next(), commandLineOption);
        }
        return commandLineOption;
    }
}
