package com.basitce.htmltoapk.data.apkgenerator;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.ResourceTableReader;
import eh.l;
import g8.w;
import i0.e4;
import i8.n;
import java.io.InputStream;
import java.util.Map;
import kotlin.jvm.internal.r;
import mh.k;
import mh.x;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TemplateResourceResolver {
    public static final TemplateResourceResolver INSTANCE = new TemplateResourceResolver();
    private static final k reference = new k("@(mipmap|style|xml|integer|bool)/[A-Za-z0-9_.]+");
    public static final int $stable = 8;

    private TemplateResourceResolver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence resolve$lambda$1(Map map, mh.h match) {
        r.e(match, "match");
        Object obj = map.get(match.getValue());
        if (obj == null) {
            throw new IllegalArgumentException(n.d("Template resource ", match.getValue(), " is missing; refusing to generate a broken APK").toString());
        }
        int iIntValue = ((Number) obj).intValue();
        w.h(16);
        return m3.a.a("@0x", x.G(8, e4.d(16, iIntValue & BodyPartID.bodyIdMax)));
    }

    public final String resolve(String manifestXml, InputStream resourceTable) {
        r.e(manifestXml, "manifestXml");
        r.e(resourceTable, "resourceTable");
        return resolve$app_release(manifestXml, ResourceTableReader.INSTANCE.read(resourceTable));
    }

    public final String resolve$app_release(String manifestXml, final Map<String, Integer> ids) {
        r.e(manifestXml, "manifestXml");
        r.e(ids, "ids");
        return reference.f(new l() { // from class: com.basitce.htmltoapk.data.apkgenerator.j
            @Override // eh.l
            public final Object invoke(Object obj) {
                return TemplateResourceResolver.resolve$lambda$1(ids, (mh.h) obj);
            }
        }, manifestXml);
    }
}
