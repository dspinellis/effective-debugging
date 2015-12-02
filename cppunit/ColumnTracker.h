class ColumnTracker {
private:
    int column;
    static const int tab_length = 8;
public:
    ColumnTracker() : column(0) {}

    int position() const { return column; }

    void process(int c) {
        switch (c) {
        case '\n':
            column = 0;
            break;
        case '\t':
            column = (column / tab_length + 1) * tab_length;
            break;
        default:
            column++;
            break;
        }
    }
};
