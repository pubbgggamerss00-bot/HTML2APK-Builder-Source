package org.bouncycastle.mime;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface MimeMultipartContext extends MimeContext {
    MimeContext createContext(int i10) throws IOException;
}
