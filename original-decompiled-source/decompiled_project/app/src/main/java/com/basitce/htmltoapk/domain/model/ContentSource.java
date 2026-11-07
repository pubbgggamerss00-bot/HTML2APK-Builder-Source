package com.basitce.htmltoapk.domain.model;

import bi.f;
import e9.w0;
import h9.p;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.h0;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.v0;
import o8.a;
import o8.c;
import pg.j;
import pg.k;
import zh.b;
import zh.g;

@g
/* loaded from: classes.dex */
public abstract class ContentSource {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final j<b<Object>> $cachedSerializer$delegate = w0.a(k.f21466a, new a());

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) ContentSource.$cachedSerializer$delegate.getValue();
        }

        public final b<ContentSource> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    @g
    public static final class Local extends ContentSource {
        public static final int $stable = 0;
        public static final Local INSTANCE = new Local();
        private static final /* synthetic */ j<b<Object>> $cachedSerializer$delegate = w0.a(k.f21466a, new o8.b());

        private Local() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ b _init_$_anonymous_() {
            return new ObjectSerializer("com.basitce.htmltoapk.domain.model.ContentSource.Local", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Local);
        }

        public int hashCode() {
            return -307124620;
        }

        public final b<Local> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Local";
        }
    }

    @g
    public static final class Pdf extends ContentSource {
        public static final int $stable = 0;
        public static final Pdf INSTANCE = new Pdf();
        private static final /* synthetic */ j<b<Object>> $cachedSerializer$delegate = w0.a(k.f21466a, new p(1));

        private Pdf() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ b _init_$_anonymous_() {
            return new ObjectSerializer("com.basitce.htmltoapk.domain.model.ContentSource.Pdf", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pdf);
        }

        public int hashCode() {
            return 1152755259;
        }

        public final b<Pdf> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Pdf";
        }
    }

    @g
    public static final class Url extends ContentSource {
        public static final int $stable = 0;
        public static final Url INSTANCE = new Url();
        private static final /* synthetic */ j<b<Object>> $cachedSerializer$delegate = w0.a(k.f21466a, new c());

        private Url() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ b _init_$_anonymous_() {
            return new ObjectSerializer("com.basitce.htmltoapk.domain.model.ContentSource.Url", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Url);
        }

        public int hashCode() {
            return 1152760504;
        }

        public final b<Url> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Url";
        }
    }

    public /* synthetic */ ContentSource(kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _init_$_anonymous_() {
        return new SealedClassSerializer("com.basitce.htmltoapk.domain.model.ContentSource", h0.a(ContentSource.class), new kh.c[]{h0.a(Local.class), h0.a(Pdf.class), h0.a(Url.class)}, new b[]{new ObjectSerializer("com.basitce.htmltoapk.domain.model.ContentSource.Local", Local.INSTANCE, new Annotation[0]), new ObjectSerializer("com.basitce.htmltoapk.domain.model.ContentSource.Pdf", Pdf.INSTANCE, new Annotation[0]), new ObjectSerializer("com.basitce.htmltoapk.domain.model.ContentSource.Url", Url.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(ContentSource contentSource, ci.c cVar, f fVar) {
    }

    private ContentSource() {
    }

    public /* synthetic */ ContentSource(int i10, v0 v0Var) {
    }
}
