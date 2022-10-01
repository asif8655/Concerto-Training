describe('testing Greet Function',()=>{
    beforEach(()=>{
        console.log('before each')
    })
    it('first test',()=>expect(true).toBe(true))
    it('second failed test case',()=>{expect(4).toBe(4)})
    afterEach(()=>{
        console.log('before each')
    })
})

// describe('testing Greet Function 2',()=>{
//     beforEach(()=>{
//         console.log('before each')
//     })
//     it('first test',()=>expect(true).toBe(true))
//     it('second failed test case',()=>{expect(4).toBe(4)})
//     beforEach(()=>{
//         console.log('before each')
//     })
// })