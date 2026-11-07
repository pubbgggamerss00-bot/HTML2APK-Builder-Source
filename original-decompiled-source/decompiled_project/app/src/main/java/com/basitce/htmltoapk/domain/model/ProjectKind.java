package com.basitce.htmltoapk.domain.model;

import java.util.List;
import kotlin.jvm.internal.r;
import qg.p;
import qg.x;

/* loaded from: classes.dex */
public final class ProjectKind {
    public static final ProjectKind INSTANCE = new ProjectKind();
    public static final String APK = "apk";
    public static final String HTML = "html";
    public static final String PDF = "pdf";
    private static final List<String> all = p.j(APK, HTML, PDF);
    public static final int $stable = 8;

    private ProjectKind() {
    }

    public final List<String> getAll() {
        return all;
    }

    public final String normalize(String str) {
        if (!x.w(all, str)) {
            return APK;
        }
        r.b(str);
        return str;
    }
}
