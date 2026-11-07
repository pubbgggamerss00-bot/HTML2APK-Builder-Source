package org.jf.dexlib2.iface.reference;

/* loaded from: classes3.dex */
public interface Reference {
    void validateReference() throws InvalidReferenceException;

    public static class InvalidReferenceException extends Exception {
        private final String invalidReferenceRepresentation;

        public InvalidReferenceException(String str) {
            super("Invalid reference");
            this.invalidReferenceRepresentation = str;
        }

        public String getInvalidReferenceRepresentation() {
            return this.invalidReferenceRepresentation;
        }

        public InvalidReferenceException(String str, String str2) {
            super(str2);
            this.invalidReferenceRepresentation = str;
        }

        public InvalidReferenceException(String str, String str2, Throwable th2) {
            super(str2, th2);
            this.invalidReferenceRepresentation = str;
        }

        public InvalidReferenceException(String str, Throwable th2) {
            super(th2);
            this.invalidReferenceRepresentation = str;
        }
    }
}
