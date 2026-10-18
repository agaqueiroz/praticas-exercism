use unicode_segmentation::UnicodeSegmentation;

pub fn reverse(input: &str) -> String {
    /*
    let chars: Vec<char> = input.chars().collect();
    let mut new_string = String::new();
    let mut reverse_count = chars.len();
    loop {
        if reverse_count != 0 {
            new_string.push(chars[reverse_count - 1]);
            reverse_count -= 1;
        }
        else {
            break;
        }
    }
    */
    let invertido = input.graphemes(true)
                         .rev()
                         .collect();
    return invertido;
}
