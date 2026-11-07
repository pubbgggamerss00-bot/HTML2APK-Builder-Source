package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlEncoder;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return BinaryXmlEncoder.attributeOrder$lambda$5((BinaryXmlEncoder.Attr) obj, (BinaryXmlEncoder.Attr) obj2);
    }
}
