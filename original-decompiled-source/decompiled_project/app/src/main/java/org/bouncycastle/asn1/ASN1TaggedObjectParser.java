package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    int getTagClass();

    int getTagNo();

    boolean hasContextTag();

    boolean hasContextTag(int i10);

    boolean hasTag(int i10, int i11);

    boolean hasTagClass(int i10);

    ASN1Encodable parseBaseUniversal(boolean z10, int i10) throws IOException;

    ASN1Encodable parseExplicitBaseObject() throws IOException;

    ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException;

    ASN1TaggedObjectParser parseImplicitBaseTagged(int i10, int i11) throws IOException;
}
