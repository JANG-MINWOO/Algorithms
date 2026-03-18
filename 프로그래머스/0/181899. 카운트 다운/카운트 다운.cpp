#include <string>
#include <vector>

using namespace std;

vector<int> solution(int start_num, int end_num) {
    vector<int> answer(start_num - end_num + 1);
    for (int i = 0; i < answer.size(); i++) {
        answer[i] = start_num--;
    }
    return answer;
}