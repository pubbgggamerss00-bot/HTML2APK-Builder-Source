package org.gradle.wrapper;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/Logger.class */
public final class Logger implements Appendable {
    public final boolean quiet;

    public Logger(boolean z10) {
        this.quiet = z10;
    }

    public final void log(String str) {
        if (this.quiet) {
            return;
        }
        System.out.println(str);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        if (!this.quiet) {
            System.out.append(c10);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (!this.quiet) {
            System.out.append(charSequence);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (!this.quiet) {
            System.out.append(charSequence, i10, i11);
        }
        return this;
    }
}
