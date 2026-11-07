package com.basitce.htmltoapk.domain.model;

import android.net.Uri;
import i0.u2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l0.k;
import r.e2;
import wg.a;

/* loaded from: classes.dex */
public final class ProjectFile {
    public static final int $stable = 8;
    private String content;
    private final String name;
    private final String relativePath;
    private final long sizeBytes;
    private final Type type;
    private final Uri uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type HTML = new Type("HTML", 0);
        public static final Type CSS = new Type("CSS", 1);
        public static final Type JS = new Type("JS", 2);
        public static final Type ASSET = new Type("ASSET", 3);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{HTML, CSS, JS, ASSET};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = u2.e(typeArr$values);
        }

        private Type(String str, int i10) {
        }

        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ProjectFile(Uri uri, String name, String relativePath, long j10, Type type, String str) {
        r.e(uri, "uri");
        r.e(name, "name");
        r.e(relativePath, "relativePath");
        r.e(type, "type");
        this.uri = uri;
        this.name = name;
        this.relativePath = relativePath;
        this.sizeBytes = j10;
        this.type = type;
        this.content = str;
    }

    public static /* synthetic */ ProjectFile copy$default(ProjectFile projectFile, Uri uri, String str, String str2, long j10, Type type, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = projectFile.uri;
        }
        if ((i10 & 2) != 0) {
            str = projectFile.name;
        }
        if ((i10 & 4) != 0) {
            str2 = projectFile.relativePath;
        }
        if ((i10 & 8) != 0) {
            j10 = projectFile.sizeBytes;
        }
        if ((i10 & 16) != 0) {
            type = projectFile.type;
        }
        if ((i10 & 32) != 0) {
            str3 = projectFile.content;
        }
        long j11 = j10;
        String str4 = str2;
        return projectFile.copy(uri, str, str4, j11, type, str3);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.relativePath;
    }

    public final long component4() {
        return this.sizeBytes;
    }

    public final Type component5() {
        return this.type;
    }

    public final String component6() {
        return this.content;
    }

    public final ProjectFile copy(Uri uri, String name, String relativePath, long j10, Type type, String str) {
        r.e(uri, "uri");
        r.e(name, "name");
        r.e(relativePath, "relativePath");
        r.e(type, "type");
        return new ProjectFile(uri, name, relativePath, j10, type, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectFile)) {
            return false;
        }
        ProjectFile projectFile = (ProjectFile) obj;
        return r.a(this.uri, projectFile.uri) && r.a(this.name, projectFile.name) && r.a(this.relativePath, projectFile.relativePath) && this.sizeBytes == projectFile.sizeBytes && this.type == projectFile.type && r.a(this.content, projectFile.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final Type getType() {
        return this.type;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + e2.a(k.a(k.a(this.uri.hashCode() * 31, 31, this.name), 31, this.relativePath), 31, this.sizeBytes)) * 31;
        String str = this.content;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isEditable() {
        Type type = this.type;
        return type == Type.HTML || type == Type.CSS || type == Type.JS;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public String toString() {
        return "ProjectFile(uri=" + this.uri + ", name=" + this.name + ", relativePath=" + this.relativePath + ", sizeBytes=" + this.sizeBytes + ", type=" + this.type + ", content=" + this.content + ")";
    }

    public /* synthetic */ ProjectFile(Uri uri, String str, String str2, long j10, Type type, String str3, int i10, j jVar) {
        this(uri, str, str2, j10, type, (i10 & 32) != 0 ? null : str3);
    }
}
