package org.gradle.wrapper;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/GradleWrapperMain.class */
public class GradleWrapperMain {

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/GradleWrapperMain$Action.class */
    public interface Action {
        void execute();
    }

    public static void main(String[] strArr) throws URISyntaxException {
        File file;
        try {
            URI uri = GradleWrapperMain.class.getProtectionDomain().getCodeSource().getLocation().toURI();
            if (!uri.getScheme().equals("file")) {
                throw new RuntimeException(String.format("Cannot determine classpath for wrapper Jar from codebase '%s'.", uri));
            }
            try {
                file = Paths.get(uri).toFile();
            } catch (NoClassDefFoundError unused) {
                file = new File(uri.getPath());
            }
            prepareWrapper(strArr, file).execute();
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    private static org.gradle.wrapper.GradleWrapperMain.Action prepareWrapper(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    private static void lambda$prepareWrapper$0(WrapperExecutor wrapperExecutor, String[] strArr, Logger logger, Download download, File file, File file2) throws Throwable {
        File[] fileArrListFiles;
        File fileCreateDist = new Install(logger, download, new PathAssembler(file, file2)).createDist(wrapperExecutor.config);
        File file3 = new File(fileCreateDist, "lib");
        File file4 = (file3.exists() && file3.isDirectory() && (fileArrListFiles = file3.listFiles(new BootstrapMainStarter$1())) != null && fileArrListFiles.length == 1) ? fileArrListFiles[0] : null;
        if (file4 == null) {
            throw new RuntimeException(String.format("Could not locate the Gradle launcher JAR in Gradle distribution '%s'.", fileCreateDist));
        }
        URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{file4.toURI().toURL()}, ClassLoader.getSystemClassLoader().getParent());
        Thread.currentThread().setContextClassLoader(uRLClassLoader);
        uRLClassLoader.loadClass("org.gradle.launcher.GradleMain").getMethod("main", String[].class).invoke(null, strArr);
        uRLClassLoader.close();
    }
}
